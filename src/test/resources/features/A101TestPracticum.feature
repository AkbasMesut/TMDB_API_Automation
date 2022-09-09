Feature: A101 Test Otomasyonu
  User story :
  Uçtan uca ödeme ekranına kadar test otomasyonu ödevi yapılacak.

  @wip
Scenario: Kullanıcı A101 sayfasından dizaltı siyah corap siparisi verir

  Given kullanıcı A101 Ana Sayfasına gider ve cerezleri kabul eder
  When  kullanıcı "Giyim & Aksesuar" kategorisini tıklar
  And   kullanıcı "Kadın İç Giyim"   kategorisini tıklar
  And   kullanıcı "Dizaltı Çorap" alt kategorisini tıklar
  And   kullanıcı "Siyah" renk filtresini tıklar
  And   kullanıcı açılan ilk ürünü seçer ve siyah olduğunu doğrular
  And   kullanıcı sepete ekle butonuna tıklar
  And   kullanıcı "Sepeti Görüntüle" butonuna tıklar
  And   kullanıcı "Sepeti Onayla"   butonuna tıklar
  And   kullanıcı Üye olmadan devam et butonuna tıklar