# recursive-prime![recursive prime](https://github.com/BetulSare/recursive-prime/assets/132604539/b1d682ac-3a78-4ff6-ae22-d6072973191e)
Bu program, kullanıcıdan bir sayı alır ve asalKontrol adlı recursive bir metot kullanarak sayının asal olup olmadığını kontrol eder. 
Recursive metot, asalKontrol(int sayi, int bolen) şeklinde iki parametre alır. İlk olarak, asalKontrol(int sayi) metodu, asal olup olmadığını 
kontrol etmek istediğimiz sayıyı ve başlangıçta bu sayıdan bir eksiğini alarak ikinci metodu çağırır. 
İkinci metot ise, bolen değeri 1 olduğunda true döndürerek durma koşulunu belirler. 
Eğer sayı bolen'e tam bölünüyorsa, false döndürerek asal olmadığını belirtir. 
Aksi halde, sayıyı ve bolen değerini bir azaltarak metodu tekrar çağırır. Sonuç olarak, program asal sayı olup olmadığını ekrana basar.
