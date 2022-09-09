package com.A101.step_definitions;

import com.A101.pages.A101MainPage;
import com.A101.utilities.BrowserUtils;
import com.A101.utilities.ConfigurationReader;
import com.A101.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.*;

public class A101TestStepDefinition {

    A101MainPage a101MainPage = new A101MainPage();

    @Given("kullanıcı A101 Ana Sayfasına gider ve cerezleri kabul eder")
    public void kullanıcı_a101_ana_sayfasına_gider_ve_cerezleri_kabul_eder() {
        Driver.getDriver().get(ConfigurationReader.getProperty("A101.url"));
        a101MainPage.cerezKullanımı.click();

    }

    @When("kullanıcı {string} kategorisini tıklar")
    public void kullanıcı_kategorisini_tıklar(String string) {
        try {
            a101MainPage.giyimAksesuar.click();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        }
    }

    @When("kullanıcı {string}   kategorisini tıklar")
    public void kullanıcı__kategorisini_tıklar(String string) {
        a101MainPage.kadınIcGiyim.click();
        BrowserUtils.waitFor(3);
    }

    @When("kullanıcı {string} alt kategorisini tıklar")
    public void kullanıcı_alt_kategorisini_tıklar(String string) {
        try {
            a101MainPage.dizaltiCorap.click();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        }
    }

    @When("kullanıcı {string} renk filtresini tıklar")
    public void kullanıcı_renk_filtresini_tıklar(String string) {
        BrowserUtils.waitFor(3);
        a101MainPage.siyahRenkCheckBox.click();

    }

    @When("kullanıcı açılan ilk ürünü seçer ve siyah olduğunu doğrular")
    public void kullanıcı_açılan_ilk_ürünü_seçer_ve_siyah_olduğunu_doğrular() {
        a101MainPage.ilkÜrün.click();
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
        try {
            a101MainPage.sepetiGörüntüle.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    @When("kullanıcı {string}   butonuna tıklar")
    public void kullanıcı__butonuna_tıklar(String string) {
        a101MainPage.sepetiOnayla.click();
    }

    @When("kullanıcı Üye olmadan devam et butonuna tıklar")
    public void kullanıcı_üye_olmadan_devam_et_butonuna_tıklar() {
        BrowserUtils.waitFor(3);
        a101MainPage.üyeOlmadanDevamEt.click();

    }


}
