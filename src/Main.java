public class Main {
    public static void main(String[] args) {

        int mas[] = {5, -3, 7, 69, 0, 2, -8, 7, 13, 4, 0};
        System.out.print("1. ");
        for (int i : mas)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("2. ");
        for (int i = mas.length - 1; i >= 0; i--)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int y = 0;
        for (int i : mas) y += i;
        System.out.println("3. " + y);

        int x = 1;
        for (int i : mas) x *= i;
        System.out.println("4. " + x);

        System.out.println("5. " + (y / (double) mas.length));

        int w = mas[0];
        for (int i : mas) if (i < w) w = i;
        System.out.println("6. " + w);

        int v = mas[0];
        for (int i : mas) if (i > v) v = i;
        System.out.println("7. " + v);

        int u = 0;
        for (int i = 1; i < mas.length; i++)
            if (mas[i] < mas[u]) u = i;
        System.out.println("8. " + u);

        int t = 0;
        for (int i = 1; i < mas.length; i++)
            if (mas[i] > mas[t]) t = i;
        System.out.println("9. " + t);

        int s = 0;
        for (int i : mas) if (i % 2 == 0) s++;
        System.out.println("10. " + s);

        int r = 0;
        for (int i : mas) if (i % 2 != 0) r++;
        System.out.println("11. " + r);

        int q = 0;
        for (int i : mas) if (i > 0) q++;
        System.out.println("12. " + q);

        int p = 0;
        for (int i : mas) if (i < 0) p++;
        System.out.println("13. " + p);

        for (int i = 0; i < mas.length; i++)
            if (mas[i] < 0) mas[i] = 0;

        System.out.print("14. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        int o = 7, n = 0;
        for (int i : mas) if (i == o) n++;
        System.out.println("15. " + n);

        boolean m = false;
        for (int i : mas) if (i == o) m = true;
        System.out.println("16. " + m);

        int l = -1;
        for (int i = 0; i < mas.length; i++)
            if (mas[i] == o) { l = i; break; }
        System.out.println("17. " + l);

        int k = -1;
        for (int i = mas.length - 1; i >= 0; i--)
            if (mas[i] == o) { k = i; break; }
        System.out.println("18. " + k);

        int qw = mas[0];
        mas[0] = mas[mas.length - 1];
        mas[mas.length - 1] = qw;

        System.out.print("19. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        System.out.println("20. " + (v - w));

        System.out.print("21. ");
        for (int i = 0; i < mas.length; i += 2) System.out.print(mas[i] + " ");
        System.out.println();

        System.out.print("22. ");
        for (int i = 1; i < mas.length; i += 2) System.out.print(mas[i] + " ");
        System.out.println();

        int an = 0;
        for (int i = 0; i < mas.length; i += 2) i += mas[i];
        System.out.println("23. " + an);

        int h = 0;
        for (int i = 1; i < mas.length; i += 2) h += mas[i];
        System.out.println("24. " + h);

        boolean g = false;
        for (int i : mas)
        {
            if (i == 0)
            {
                g = true;
            }
        }
        System.out.println("25. " + g);

        int[] b = new int[mas.length];
        for (int i = 0; i < mas.length; i++)
        {
            b[i] = mas[i];
        }
        System.out.print("26. ");
        for (int i : b) System.out.print(i + " ");
        System.out.println();


        int c1 = 0;
        for (int i : mas) if (i % 2 == 0) c1++;
        int[] c = new int[c1];
        int d = 0;
        for (int i : mas)
        {
            if (i % 2 == 0)
            {
                c[d] = i;
                d++;
            }
        }
        System.out.print("27. ");
        for (int i : c) System.out.print(i + " ");
        System.out.println();


        int e1 = 0;
        for (int i : mas) if (i % 2 != 0) e1++;
        int[] e = new int[e1];
        int f = 0;
        for (int i : mas)
        {
            if (i % 2 != 0)
            {
                e[f] = i;
                f++;
            }
        }
        System.out.print("28. ");
        for (int i : e) System.out.print(i + " ");
        System.out.println();


        int g1 = 0;
        for (int i : mas) if (i != 0) g1++;
        int[] g2 = new int[g1];
        int h1 = 0;
        for (int i : mas)
        {
            if (i != 0)
            {
                g2[h1] = i;
                h1++;
            }
        }
        System.out.print("29. ");
        for (int i : g2) System.out.print(i + " ");
        System.out.println();

        int add = 99;
        int[] j1 = new int[mas.length + 1];
        for (int i = 0; i < mas.length; i++) j1[i] = mas[i];
        j1[j1.length - 1] = add;
        System.out.print("30. ");
        for (int i : j1) System.out.print(i + " ");
        System.out.println();

        int idx = 3;
        int val = 55;
        int[] k1 = new int[mas.length + 1];
        for (int i = 0, j = 0; i < k1.length; i++)
        {
            if (i == idx) k1[i] = val;
            else
            {
                k1[i] = mas[j];
                j++;
            }
        }
        System.out.print("31. ");
        for (int i : k1) System.out.print(i + " ");
        System.out.println();

        int del = 2;
        int[] l1 = new int[mas.length - 1];
        for (int i = 0, j = 0; i < mas.length; i++)
        {
            if (i != del)
            {
                l1[j] = mas[i];
                j++;
            }
        }
        System.out.print("32. ");
        for (int i : l1) System.out.print(i + " ");
        System.out.println();

        int rem = 7;
        int pos = -1;
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] == rem)
            {
                pos = i;
                break;
            }
        }
        if (pos != -1)
        {
            int[] m1 = new int[mas.length - 1];
            for (int i = 0, j = 0; i < mas.length; i++)
            {
                if (i != pos)
                {
                    m1[j] = mas[i];
                    j++;
                }
            }
            System.out.print("33. ");
            for (int i : m1) System.out.print(i + " ");
            System.out.println();
        }

        int cnt = 0;
        for (int i : mas) if (i != rem) cnt++;
        int[] n1 = new int[cnt];
        int t1 = 0;
        for (int i : mas)
        {
            if (i != rem)
            {
                n1[t1] = i;
                t1++;
            }
        }
        System.out.print("34. ");
        for (int i : n1) System.out.print(i + " ");
        System.out.println();


        int[] o1 = new int[mas.length];
        for (int i = 0; i < mas.length; i++)
        {
            o1[i] = mas[mas.length - 1 - i];
        }
        System.out.print("35. ");
        for (int i : o1) System.out.print(i + " ");
        System.out.println();

        int last = mas[mas.length - 1];
        for (int i = mas.length - 1; i > 0; i--)
        {
            mas[i] = mas[i - 1];
        }
        mas[0] = last;
        System.out.print("36. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        int first = mas[0];
        for (int i = 0; i < mas.length - 1; i++)
        {
            mas[i] = mas[i + 1];
        }
        mas[mas.length - 1] = first;
        System.out.print("37. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        int step = 2;
        for (int s1 = 0; s1 < step; s1++)
        {
            int tmp = mas[mas.length - 1];
            for (int i = mas.length - 1; i > 0; i--) mas[i] = mas[i - 1];
            mas[0] = tmp;
        }
        System.out.print("38. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        for (int s1 = 0; s1 < step; s1++)
        {
            int tmp = mas[0];
            for (int i = 0; i < mas.length - 1; i++) mas[i] = mas[i + 1];
            mas[mas.length - 1] = tmp;
        }
        System.out.print("39. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        int X = 10;
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] > X) mas[i] = X;
        }
        System.out.print("40. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] < X) mas[i] = X;
        }
        System.out.print("41. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] % 2 == 0) mas[i] = 0;
        }
        System.out.print("42. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] % 2 != 0) mas[i] = 1;
        }
        System.out.print("43. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < mas.length; i++)
        {
            mas[i] *= 2;
        }
        System.out.print("44. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = mas[i] * mas[i];
        }
        System.out.print("45. ");
        for (int i : mas) System.out.print(i + " ");
        System.out.println();

        boolean a1 = true;
        for (int i = 1; i < mas.length; i++)
        {
            if (mas[i] < mas[i - 1]) a1 = false;
        }
        System.out.println("46. " + a1);


        boolean a2 = true;
        for (int i = 1; i < mas.length; i++)
        {
            if (mas[i] > mas[i - 1]) a2 = false;
        }
        System.out.println("47. " + a2);


        boolean a3 = false;
        for (int i = 0; i < mas.length; i++)
        {
            for (int j = i + 1; j < mas.length; j++)
            {
                if (mas[i] == mas[j]) a3 = true;
            }
        }
        System.out.println("48. " + a3);


        int rep = -1;
        for (int i = 0; i < mas.length; i++)
        {
            for (int j = i + 1; j < mas.length; j++)
            {
                if (mas[i] == mas[j])
                {
                    rep = mas[i];
                    break;
                }
            }
            if (rep != -1) break;
        }
        System.out.println("49. " + rep);

        int[] srt = mas.clone();
        for (int i = 0; i < srt.length; i++)
        {
            for (int j = i + 1; j < srt.length; j++)
            {
                if (srt[i] > srt[j])
                {
                    int sw = srt[i];
                    srt[i] = srt[j];
                    srt[j] = sw;
                }
            }
        }

        int uniq = 0;
        for (int i = 0; i < srt.length; i++)
        {
            if (i == 0 || srt[i] != srt[i - 1]) uniq++;
        }
        System.out.println("50. " + uniq);


        int secondMax = srt[srt.length - 1];
        for (int i = srt.length - 2; i >= 0; i--)
        {
            if (srt[i] != srt[srt.length - 1])
            {
                secondMax = srt[i];
                break;
            }
        }
        System.out.println("51. " + secondMax);


        int thirdMax = srt[srt.length - 1];
        int found = 0;
        for (int i = srt.length - 1; i >= 0; i--)
        {
            if (i == srt.length - 1 || srt[i] != srt[i + 1])
            {
                found++;
                if (found == 3)
                {
                    thirdMax = srt[i];
                    break;
                }
            }
        }
        System.out.println("52. " + thirdMax);

        int[] mm = mas.clone();
        for (int i = 0; i < mm.length - 1; i++)
        {
            for (int j = i + 1; j < mm.length; j++)
            {
                if (mm[i] > mm[j])
                {
                    int tmp = mm[i];
                    mm[i] = mm[j];
                    mm[j] = tmp;
                }
            }
        }
        System.out.println("53. " + mm[0] + " " + mm[1]);
        System.out.println("54. " + mm[mm.length - 1] + " " + mm[mm.length - 2]);

        int best = mas[0], bc = 0;
        for (int i = 0; i < mas.length; i++)
        {
            int ck = 0;
            for (int j = 0; j < mas.length; j++)
            {
                if (mas[i] == mas[j]) ck++;
            }
            if (ck > bc)
            {
                bc = ck;
                best = mas[i];
            }
        }
        System.out.println("55. " + best);


        System.out.print("56. ");
        for (int i = 0; i < mas.length; i++)
        {
            int ca = 0;
            for (int j = 0; j < mas.length; j++)
            {
                if (mas[i] == mas[j]) ca++;
            }
            System.out.print("(" + mas[i] + ":" + ca + ") ");
        }
        System.out.println();


        int len = 1, bestLen = 1;
        for (int i = 1; i < mas.length; i++)
        {
            if (mas[i] == mas[i - 1]) len++;
            else len = 1;
            if (len > bestLen) bestLen = len;
        }
        System.out.println("57. " + bestLen);


        int imin = 0, imax = 0;
        for (int i = 1; i < mas.length; i++)
        {
            if (mas[i] < mas[imin]) imin = i;
            if (mas[i] > mas[imax]) imax = i;
        }
        int sum = 0;
        int L = Math.min(imin, imax);
        int R = Math.max(imin, imax);
        for (int i = L + 1; i < R; i++) sum += mas[i];
        System.out.println("58. " + sum);


        double avg = 0;
        for (int i : mas) avg += i;
        avg /= mas.length;
        int idx2 = 0;
        double bestDiff = Math.abs(mas[0] - avg);
        for (int i = 1; i < mas.length; i++)
        {
            double dd = Math.abs(mas[i] - avg);
            if (d < bestDiff)
            {
                bestDiff = dd;
                idx2 = i;
            }
        }
        System.out.println("59. " + idx2);


        int[] tmp = mas.clone();
        for (int i = 0; i < tmp.length; i++)
        {
            for (int j = i + 1; j < tmp.length; j++)
            {
                if (tmp[i] > tmp[j])
                {
                    int sw = tmp[i];
                    tmp[i] = tmp[j];
                    tmp[j] = sw;
                }
            }
        }
        double med;
        if (tmp.length % 2 == 0)
            med = (tmp[tmp.length / 2 - 1] + tmp[tmp.length / 2]) / 2.0;
        else
            med = tmp[tmp.length / 2];
        System.out.println("60. " + med);


        boolean pal = true;
        for (int i = 0; i < mas.length / 2; i++)
        {
            if (mas[i] != mas[mas.length - 1 - i]) pal = false;
        }
        System.out.println("61. " + pal);


        int[] other = mas.clone();
        boolean eq = true;
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] != other[i]) eq = false;
        }
        System.out.println("62. " + eq);


        System.out.print("63. ");
        for (int i : mas)
        {
            for (int j : other)
            {
                if (i == j)
                {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
        System.out.println();


        System.out.print("64. ");
        for (int i : mas) System.out.print(i + " ");
        for (int i : other) System.out.print(i + " ");
        System.out.println();


        boolean sub = true;
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] != other[i])
            {
                sub = false;
                break;
            }
        }
        System.out.println("65. " + sub);

        int[] b1 = mas.clone();
        for (int i = 0; i < b1.length - 1; i++)
        {
            for (int j = 0; j < b1.length - 1 - i; j++)
            {
                if (b1[j] > b1[j + 1])
                {
                    int t13 = b1[j];
                    b1[j] = b1[j + 1];
                    b1[j + 1] = t13;
                }
            }
        }
        System.out.print("66. ");
        for (int i : b1) System.out.print(i + " ");
        System.out.println();


        int[] b2 = mas.clone();
        for (int i = 0; i < b2.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < b2.length; j++)
            {
                if (b2[j] < b2[min]) min = j;
            }
            int t12 = b2[i];
            b2[i] = b2[min];
            b2[min] = t12;
        }
        System.out.print("67. ");
        for (int i : b2) System.out.print(i + " ");
        System.out.println();


        int[] b3 = mas.clone();
        for (int i = 1; i < b3.length; i++)
        {
            int key = b3[i];
            int j = i - 1;
            while (j >= 0 && b3[j] > key)
            {
                b3[j + 1] = b3[j];
                j--;
            }
            b3[j + 1] = key;
        }
        System.out.print("68. ");
        for (int i : b3) System.out.print(i + " ");
        System.out.println();


        int[] b4 = mas.clone();
        for (int i = 0; i < b4.length - 1; i++)
        {
            for (int j = 0; j < b4.length - 1 - i; j++)
            {
                if (b4[j] < b4[j + 1])
                {
                    int tk = b4[j];
                    b4[j] = b4[j + 1];
                    b4[j + 1] = tk;
                }
            }
        }
        System.out.print("69. ");
        for (int i : b4) System.out.print(i + " ");
        System.out.println();


        int[] b5 = mas.clone();
        for (int i = 0; i < b5.length; i++)
        {
            for (int j = i + 1; j < b5.length; j++)
            {
                if (b5[i] % 2 == 0 && b5[j] % 2 == 0 && b5[i] > b5[j])
                {
                    int tm = b5[i];
                    b5[i] = b5[j];
                    b5[j] = tm;
                }
            }
        }
        System.out.print("70. ");
        for (int i : b5) System.out.print(i + " ");
        System.out.println();


        int[] b6 = mas.clone();
        for (int i = 0; i < b6.length; i++)
        {
            for (int j = i + 1; j < b6.length; j++)
            {
                if (b6[i] % 2 != 0 && b6[j] % 2 != 0 && b6[i] > b6[j])
                {
                    int t34 = b6[i];
                    b6[i] = b6[j];
                    b6[j] = t34;
                }
            }
        }
        System.out.print("71. ");
        for (int i : b6) System.out.print(i + " ");
        System.out.println();


        int[] b7 = mas.clone();
        int kk = 5;
        for (int i = 0; i < kk - 1; i++)
        {
            for (int j = i + 1; j < kk; j++)
            {
                if (b7[i] > b7[j])
                {
                    int t57 = b7[i];
                    b7[i] = b7[j];
                    b7[j] = t57;
                }
            }
        }
        System.out.print("72. ");
        for (int i : b7) System.out.print(i + " ");
        System.out.println();


        int[] b8 = mas.clone();
        for (int i = 0; i < b8.length; i++)
        {
            for (int j = i + 1; j < b8.length; j++)
            {
                if (b8[i] > b8[j])
                {
                    int t64 = b8[i];
                    b8[i] = b8[j];
                    b8[j] = t64;
                }
            }
        }
        int kpos = 3;
        System.out.println("73. " + b8[b8.length - kpos]);


        System.out.println("74. " + b8[kpos - 1]);


        int find = b8[3];
        int Ln = 0, Rn = b8.length - 1, mid, pos2 = -1;
        while (Ln <= Rn)
        {
            mid = (Ln + Rn) / 2;
            if (b8[mid] == find)
            {
                pos2 = mid;
                break;
            }
            else if (b8[mid] < find) Ln = mid + 1;
            else Rn = mid - 1;
        }
        System.out.println("75. " + pos2);

        System.out.print("76. ");
        for (int i : mas) if (i % 2 != 0) System.out.print(i + " ");
        System.out.println();

        System.out.print("77. ");
        for (int i : mas) if (i > 0) System.out.print(i + " ");
        System.out.println();

        System.out.print("78. ");
        for (int i : mas) if (i < 0) System.out.print(i + " ");
        System.out.println();

        int s79 = 0;
        for (int i : mas) s79 += i;
        System.out.println("79. " + s79);

        int s80 = 0, k80 = 0;
        for (int i : mas) if (i % 2 == 0) { s80 += i; k80++; }
        System.out.println("80. " + (k80 == 0 ? 0 : s80 / k80));

        int max81 = mas[0];
        for (int i : mas) if (i > max81) max81 = i;
        System.out.println("81. " + max81);

        int min82 = mas[0];
        for (int i : mas) if (i < min82) min82 = i;
        System.out.println("82. " + min82);

        System.out.print("83. ");
        for (int i : mas) System.out.print((i * i) + " ");
        System.out.println();

        System.out.print("84. ");
        for (int i : mas) System.out.print(Math.abs(i) + " ");
        System.out.println();

        int k85 = 0;
        for (int i : mas) if (i == 0) k85++;
        System.out.println("85. " + k85);

        System.out.print("86. ");
        for (int i : mas) if (i % 3 == 0) System.out.print(i + " ");
        System.out.println();

        System.out.print("87. ");
        for (int i : mas) if (i % 5 == 0) System.out.print(i + " ");
        System.out.println();

        int k88 = 0;
        for (int i : mas) if (i > 10) k88++;
        System.out.println("88. " + k88);

        int k89 = 0;
        for (int i : mas) if (i < -10) k89++;
        System.out.println("89. " + k89);

        System.out.print("90. ");
        for (int i : mas) if (i % 2 == 0 && i > 0) System.out.print(i + " ");
        System.out.println();

        System.out.print("91. ");
        for (int i : mas) if (i % 2 != 0 && i < 0) System.out.print(i + " ");
        System.out.println();

        int s92 = 0;
        for (int i : mas) if (i > 0) s92 += i;
        System.out.println("92. " + s92);

        int s93 = 0;
        for (int i : mas) if (i < 0) s93 += i;
        System.out.println("93. " + s93);

        int k94 = 0;
        for (int i : mas) if (i % 7 == 0) k94++;
        System.out.println("94. " + k94);

        System.out.print("95. ");
        for (int i = mas.length - 1; i >= 0; i--) System.out.print(mas[i] + " ");
        System.out.println();

        int lastofus = mas[mas.length - 1];
        System.out.println("96. " + lastofus);

        int firstofus = mas[0];
        System.out.println("97. " + firstofus);

        System.out.println("98. " + (firstofus + lastofus));

        MyMas arr = new MyMas();
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(10);
        arr.add(1);
        System.out.print("99. ");
        arr.print();
        arr.add(42);
        System.out.print("99 (after add 42): ");
        arr.print();
        arr.removeLast();
        System.out.print("99 (after remove last): ");
        arr.print();
        System.out.println("Size: " + arr.size());
        System.out.println("Element at index 2: " + arr.get(2));
    }
}
class MyMas
{
    private int[] data;
    private int count;
    public MyMas()
    {
        data = new int[4];
        count = 0;
    }
    public void add(int value)
    {
        if (count == data.length)
        {
            int[] tmp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) tmp[i] = data[i];
            data = tmp;
        }
        data[count++] = value;
    }
    public int get(int index)
    {
        if (index < 0 || index >= count) return -1;
        return data[index];
    }
    public void removeLast()
    {
        if (count > 0)
        {
            count--;
        }
    }
    public int size()
    {
        return count;
    }
    public void print()
    {
        for (int i = 0; i < count; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
