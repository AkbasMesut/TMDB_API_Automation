package com.A101.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class A101MainPage extends BasePage {

    @FindBy(id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public  WebElement cerezKullanımı;

    @FindBy(name = "search_text")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//em[@class='input-icon icon-search'])[2]")
    public WebElement aramaButonu;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/'])[1]")
    public WebElement giyimAksesuar;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/kadin-ic-giyim/'])[2]")
    public WebElement kadınIcGiyim;

    @FindBy(partialLinkText = "Dizaltı Çorap")
    public WebElement dizaltiCorap;

    @FindBy(xpath="//label[@for='attributes_integration_colourSİYAH']")
    public WebElement siyahRenkCheckBox;

    @FindBy(xpath = "(//figure[@class='product-image '])[1]")
    public WebElement ilkÜrün;

    @FindBy(xpath = "//div[@class='selected-variant-text']/span")
    public WebElement secilenRenk;

    @FindBy(xpath = "//i[@class='icon-sepetekle']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//a[@class='go-to-shop']")
    public WebElement sepetiGörüntüle;

    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[2]")
    public WebElement sepetiOnayla;

    @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    public WebElement üyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
    public WebElement yeniAdresOluştur;

    @FindBy(name = "title")
    public WebElement adresBaşlığı;

    @FindBy(name = "first_name")
    public WebElement ad;

    @FindBy(name = "last_name")
    public WebElement soyadı;

    @FindBy(name = "phone_number")
    public WebElement cepTelefonu;

    @FindBy(name = "city")
    public WebElement şehir;

    @FindBy(name = "township")
    public WebElement ilce;

    @FindBy(name = "district")
    public WebElement mahalle;

    @FindBy(name = "line")
    public WebElement adres;

    @FindBy(xpath = "//button[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    public WebElement kaydet;

    @FindBy(xpath = "//input[@value='333']")
    public WebElement kargoCheckBox;

    @FindBy(xpath = "//button[@data-index='1']")
    public WebElement kaydetVeDevamEtButonu;

    @FindBy(linkText = "2. ÖDEME SEÇENEKLERİ")
    public WebElement kartIleOdeme;

    @FindBy(xpath = "(//div[@onclick='persona_PopupClose();'])[1]")
    public WebElement popUpPencere;

















}
