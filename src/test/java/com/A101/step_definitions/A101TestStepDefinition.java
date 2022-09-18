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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class A101TestStepDefinition {

    A101MainPage a101MainPage = new A101MainPage();

    @Given("kullanıcı A101 Web sitesine gider ve cerezleri kabul eder")
    public void kullanıcı_a101_web_sitesine_gider_ve_cerezleri_kabul_eder() {
        Driver.getDriver().get(ConfigurationReader.getProperty("A101.url"));
        a101MainPage.cerezKullanımı.click();
    }

    @When("kullanıcı {string} kategorisini tıklar")
    public void kullanıcı_kategorisini_tıklar(String string) {
        a101MainPage.giyimAksesuar.click();
        BrowserUtils.waitForPageToLoad(5);
    }

    @When("kullanıcı {string}   kategorisini tıklar")
    public void kullanıcı__kategorisini_tıklar(String string) {
        a101MainPage.kadınIcGiyim.click();
    }

    @When("kullanıcı {string} alt kategorisini tıklar")
    public void kullanıcı_alt_kategorisini_tıklar(String string) {
        BrowserUtils.waitForPageToLoad(5);
        try {
            a101MainPage.dizaltiCorap.click();
        }catch (ElementClickInterceptedException e){
            BrowserUtils.waitForClickablility(a101MainPage.dizaltiCorap,10);
            a101MainPage.dizaltiCorap.click();
        }
    }

    @When("kullanıcı {string} renk filtresini tıklar")
    public void kullanıcı_renk_filtresini_tıklar(String string) {
        try{
            a101MainPage.siyahRenkCheckBox.click();
        }catch (Exception e){
            BrowserUtils.selectCheckBox(a101MainPage.siyahRenkCheckBox,true);
        }
    }

    @When("kullanıcı açılan ilk ürünü seçer ve siyah olduğunu doğrular")
    public void kullanıcı_açılan_ilk_ürünü_seçer_ve_siyah_olduğunu_doğrular() {
        try {
            a101MainPage.ilkÜrün.click();
        }catch (Exception e){
            BrowserUtils.waitForClickablility(a101MainPage.ilkÜrün,10);
            a101MainPage.ilkÜrün.click();
        }
        String expectedResult = "SİYAH";
        String actualResult = a101MainPage.seçilenRenk.getText();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println(a101MainPage.seçilenRenk.getText());
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
        Select ilçe = new Select(a101MainPage.ilçe);
        ilçe.selectByIndex(2);
        Select mahalle = new Select(a101MainPage.mahalle);
        BrowserUtils.waitFor(3);
        mahalle.selectByVisibleText("ATIFBEY MAH");

        try {
            a101MainPage.adres.sendKeys(faker.address().fullAddress());
        }catch (StaleElementReferenceException e){
            BrowserUtils.waitForStaleElement(a101MainPage.adres,10);
            a101MainPage.adres.sendKeys(faker.address().fullAddress());
        }
        a101MainPage.postaKodu.sendKeys("06210", Keys.ENTER);
        a101MainPage.kaydet.click();
    }

    @When("kullanıcı {string} butonuna basar")
    public void kullanıcı_butonuna_basar(String string) {
        BrowserUtils.waitFor(3);
        a101MainPage.kaydetVeDevamEtButonu.click();
    }

    @Then("kullanıcı ödeme ekranının açıldığını doğrular")
    public void kullanıcı_ödeme_ekranının_açıldığını_doğrular() {
        String expectedResult = "masterpass";
        String actualResult = a101MainPage.kartİleÖdeme.getAttribute("data-slug");
        BrowserUtils.waitForVisibility(a101MainPage.kartİleÖdeme, 10);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
