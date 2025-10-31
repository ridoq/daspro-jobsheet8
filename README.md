# Percobaan 1

Percobaan  ini ditujukan me-review kembali perulangan yang sudah dibahas pada pertemuan sebelumnya. Pada percobaan 1 akan dibuat program untuk tampilan * sebanyak N kali ke arah samping.

---
## Soal

1.	Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
2.	Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa bisa demikian?
3.	Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?

---
## Jawaban

1.	jika inisialisasi i diubah menjadi 0 maka akibatnya adalah system akan menampilkan input N + 1, kenapa? karena pada kondisi for menggunakan kurang dari "<" bukan kurang dari sama dengan, jadinya jika kita input N nya = 5 lalu menghitung dari inisialisasi (0) maka jadinya 0, 1, 2, 3, 4, 5 = ada 6 angka/perulangan.
2.	jika kondisi for diubah ke i > N yang terjadi adalah apabila N diinputkan >= 0 maka akan bernilai false (perulangan tidak akan terjadi) karena inisialisasinya bernilai 0 dan apabila diinputkan < 0 maka akan terjadi perulangan tiada henti, karena jika N = -1; i = 0; i > N; i++, nilai i akan terus bertambah (increment) hingga tak hingga karena i akan selalu lebih besar dari N.
3.	jika kondisinya bernilai false (N = ( kurang/sama dengan 0 )) perulangan tidak akan terjadi, namun jika kondisi bernilai true (N = lebih dari 0) maka akan terjadi perulangan tak hingga karena pada _update_ menggunakan decrement yang mana pada kondisi (i <= N) variable i akan terus bernilai lebih kecil dari N hingga tak hingga.

---
# Percobaan 2

Pada percobaan ke-2 akan dilakukan percobaan tentang nested loop. Kasus yang akan diselesaikan adalah untuk membuat tampilan bujursangkar *, dengan panjang sisi sebanyak N. Misalkan N dimasukan 5, maka hasilnya adalah:

```text
*****
*****
*****
*****
*****
```

---
## Soal

1.	Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi
iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
2.	Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam, Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
3.	Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada didalamnya?
4.	Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
5.	Silakan commit dan push ke repository Anda.


---
## Jawaban

1.	akibatnya adalah jumlah row/baris bintangnya akan bertambah 1 karena inisialisasi for outernya diubah menjadi 0, karena jumlah perulangannya bertambah 1 angka lebih banyak, misal yang awal nya 1, 2, 3, 4, 5 = 5 angka, menjadi 0, 1, 2, 3, 4, 5 = 6 angka
2. akibatnya adalah jumlah bintang pada setiap barisnya akan bertambah 1 karena inisialisasi for innernya diubah menjadi 0, karena jumlah perulangannya bertambah 1 angka lebih banyak, misal yang awal nya 1, 2, 3, 4, 5 = 5 angka, menjadi 0, 1, 2, 3, 4, 5 = 6 angka

---
