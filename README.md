

Proje İsmi: Rent A Car Projesi

Proje Tanımı: Bu proje, Spring Boot kullanılarak geliştirilmiş bir rent a car (araç kiralama) uygulamasını içerir. Proje, markaları, modelleri ve araçları yönetme yeteneği sağlar. Aşağıda projenin temel özellikleri açıklanmıştır:

Marka ve Model Yönetimi: Proje, araç markalarını ve modellerini eklemek, düzenlemek ve silmek için API endpoint'leri sağlar. Örneğin, yeni bir marka eklemek için "POST /api/brands" veya mevcut bir modeli güncellemek için "PUT /api/models/{modelId}" gibi işlemler yapılabilir.

Araç Yönetimi: Kullanıcılar, farklı araçları ekleyebilir, düzenleyebilir veya silebilirler. Araçların özellikleri (renk, yıl, fiyat vb.) yönetilebilir.

Filtreleme: Proje, kullanıcılara araçları marka, model, renk, yıl veya fiyata göre filtreleme yeteneği sunar. Örneğin, "GET /api/cars?brand=Toyota&color=Red" gibi bir istekle belirli kriterlere uyan araçlar listelenebilir.
