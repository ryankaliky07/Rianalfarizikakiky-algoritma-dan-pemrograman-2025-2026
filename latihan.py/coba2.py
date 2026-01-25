# Menginput Nilai Tugas, UTS, dan UAS
tugas = float(input("Input nilai Tugas: "))
uts = float(input("Input nilai UTS: "))
uas = float(input("Input nilai UAS: "))

# Menghitung Nilai Akhir sesuai dengan Bobot
nilai = (0.15 * tugas) + (0.35 * uts) + (0.50 * uas)