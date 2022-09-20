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

    @FindBy(xpath = "//a[@data-value='1567']")
    public WebElement dizaltiCorap;

    @FindBy(xpath="//label[@for='attributes_integration_colourSİYAH']")
    public WebElement siyahRenkCheckBox;

    @FindBy(xpath = "(//figure[@class='product-image '])[1]")
    public WebElement ilkÜrün;

    @FindBy(xpath = "//div[@class='selected-variant-text']/span")
    public WebElement seçilenRenk;

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

    @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBaşlığı;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement ad;

    @FindBy(name = "last_name")
    public WebElement soyadı;

    @FindBy(name = "phone_number")
    public WebElement cepTelefonu;

    @FindBy(xpath = "//select[@name='city']")
    public WebElement şehir;

    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilçe;

    @FindBy(xpath = "//select[@name='district']")
    public WebElement mahalle;

    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public WebElement adres;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement postaKodu;

    @FindBy(css = "button[class='button green js-set-country js-prevent-emoji']")
    public WebElement kaydet;

    @FindBy(xpath = "//button[@data-index='1']")
    public WebElement kaydetVeDevamEtButonu;

    @FindBy(xpath = "(//div[@data-type='masterpass'])[1]")
    public WebElement kartİleÖdeme;

    @FindBy(xpath = "(//div[@onclick='persona_PopupClose();'])[1]")
    public WebElement popUpPencere;

















}
