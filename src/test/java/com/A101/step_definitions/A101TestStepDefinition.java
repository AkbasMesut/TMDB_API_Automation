package com.A101.step_definitions;

import com.A101.pages.A101MainPage;
import com.A101.utilities.BrowserUtils;
import com.A101.utilities.ConfigurationReader;
import com.A101.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class A101TestStepDefinition {

    A101MainPage a101MainPage = new A101MainPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("kullanıcı A101 Web sitesine gider ve cerezleri kabul eder")
    public void kullanıcı_a101_web_sitesine_gider_ve_cerezleri_kabul_eder() {
        Driver.getDriver().get(ConfigurationReader.getProperty("A101.url"));
        a101MainPage.cerezKullanımı.click();
    }

    @When("kullanıcı {string} kategorisini tıklar")
    public void kullanıcı_kategorisini_tıklar(String string) {
        a101MainPage.giyimAksesuar.click();
        BrowserUtils.waitFor(3);
    }

    @When("kullanıcı {string}   kategorisini tıklar")
    public void kullanıcı__kategorisini_tıklar(String string) {
        a101MainPage.kadınIcGiyim.click();
        BrowserUtils.waitFor(3);
    }

    @When("kullanıcı {string} alt kategorisini tıklar")
    public void kullanıcı_alt_kategorisini_tıklar(String string) {
        a101MainPage.dizaltiCorap.click();
        BrowserUtils.waitFor(3);
    }

    @When("kullanıcı {string} renk filtresini tıklar")
    public void kullanıcı_renk_filtresini_tıklar(String string) {
        wait.until(ExpectedConditions.elementToBeClickable(a101MainPage.siyahRenkCheckBox));
        a101MainPage.siyahRenkCheckBox.click();

    }

    @When("kullanıcı açılan ilk ürünü seçer ve siyah olduğunu doğrular")
    public void kullanıcı_açılan_ilk_ürünü_seçer_ve_siyah_olduğunu_doğrular() {
        wait.until(ExpectedConditions.elementToBeClickable(a101MainPage.ilkÜrün));
        a101MainPage.ilkÜrün.click();
        String expectedResult = "SİYAH";
        String actualResult = a101MainPage.secilenRenk.getText();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println(a101MainPage.secilenRenk.getText());
    }

    @When("kullanıcı sepete ekle butonuna tıklar")
    public void kullanıcı_sepete_ekle_butonuna_tıklar() {
        a101MainPage.sepeteEkle.click();
    }

    @When("kullanıcı {string} butonuna tıklar")
    public void kullanıcı_butonuna_tıklar(String string) {
        a101MainPage.sepetiGörüntüle.click();
    }

    @When("kullanıcı {string}   butonuna tıklar")
    public void kullanıcı__butonuna_tıklar(String string) {
        a101MainPage.sepetiOnayla.click();
    }

    @When("kullanıcı {string}  butonuna tıklar")
    public void kullanıcı_butonuna__tıklar(String string) {
        a101MainPage.üyeOlmadanDevamEt.click();
    }

    @When("kullanıcı {string} ni doldurur ve {string} butonuna tıklar")
    public void kullanıcı_ni_doldurur_ve_butonuna_tıklar(String string, String string2) {
        a101MainPage.emailKutusu.sendKeys("Akbas_Mesut@outlook.com", ENTER);
    }

    @When("kullanıcı {string} bölümüne tıklar")
    public void kullanıcı_bölümüne_tıklar(String string) {
        a101MainPage.yeniAdresOluştur.click();
    }

    @When("kullanıcı açılan pencereye adres bilgilerini girer ve kaydet butonuna tıklar")
    public void kullanıcı_açılan_pencereye_adres_bilgilerini_girer_ve_kaydet_butonuna_tıklar() {
        Faker faker = new Faker();
        a101MainPage.adresBaşlığı.sendKeys(faker.name().username());
        a101MainPage.ad.sendKeys(faker.name().firstName());
        a101MainPage.soyadı.sendKeys(faker.name().lastName());
        a101MainPage.cepTelefonu.sendKeys(faker.phoneNumber().cellPhone());
        Select il = new Select(a101MainPage.şehir);
        il.selectByIndex(2);
        Select ilçe = new Select(a101MainPage.ilce);
        ilçe.selectByIndex(2);
        Select mahalle = new Select(a101MainPage.mahalle);
        BrowserUtils.waitFor(3);
        mahalle.selectByVisibleText("ATIFBEY MAH");
        a101MainPage.adres.sendKeys(faker.address().fullAddress());
        a101MainPage.kaydet.click();
    }

    @When("kullanıcı {string} butonuna basar")
    public void kullanıcı_butonuna_basar(String string) {
       // a101MainPage.kargoCheckBox.click();
        wait.until(ExpectedConditions.elementToBeClickable(a101MainPage.kaydetVeDevamEtButonu));
        a101MainPage.kaydetVeDevamEtButonu.click();
    }

    @Then("kullanıcı ödeme ekranının açıldığını doğrular")
    public void kullanıcı_ödeme_ekranının_açıldığını_doğrular() {
        String expectedResult = "2. ÖDEME SEÇENEKLERİ";
        String actualResult = a101MainPage.kartIleOdeme.getText();
        wait.until(ExpectedConditions.visibilityOf(a101MainPage.kartIleOdeme));
        Assert.assertEquals(expectedResult, actualResult);
    }

}
