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


---
