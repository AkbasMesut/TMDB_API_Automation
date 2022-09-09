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

    @FindBy(id="attributes_integration_colourSİYAH")
    public WebElement siyahRenkCheckBox;

    @FindBy(xpath = "(//img[@class=' ls-is-cached lazyloaded'])[1]")
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
}
