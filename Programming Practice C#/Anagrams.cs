using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgrammingProjectCSharp
{
    class Anagrams
    {
        static void Main(string[] args)
        {
            string test1 = "anagram";
            string test2 = "Nag a ram";
            Console.WriteLine(areAnagrams(test1, test2));
        }

        static bool areAnagrams(String a, String b)
        {
            char[] charA = a.ToCharArray();
            char[] charB = b.ToCharArray();

            int[] charCountA = new int[26];
            int[] charCountB = new int[26];

            for (int i = 0; i < charA.Length; i++)
            {
                switch (charA[i])
                {
                    case 'a':
                    case 'A':
                        charCountA[0]++;
                        break;    
                
                    case 'b':
                    case 'B':
                        charCountA[1]++;
                        break;

                    case 'c':
                    case 'C':
                        charCountA[2]++;
                        break;

                    case 'd':
                    case 'D':
                        charCountA[3]++;
                        break;

                    case 'e':
                    case 'E':
                        charCountA[4]++;
                        break;

                    case 'f':
                    case 'F':
                        charCountA[5]++;
                        break;

                    case 'g':
                    case 'G':
                        charCountA[6]++;
                        break;

                    case 'h':
                    case 'H':
                        charCountA[7]++;
                        break;

                    case 'i':
                    case 'I':
                        charCountA[8]++;
                        break;

                    case 'j':
                    case 'J':
                        charCountA[9]++;
                        break;

                    case 'k':
                    case 'K':
                        charCountA[10]++;
                        break;

                    case 'l':
                    case 'L':
                        charCountA[11]++;
                        break;

                    case 'm':
                    case 'M':
                        charCountA[12]++;
                        break;

                    case 'n':
                    case 'N':
                        charCountA[13]++;
                        break;

                    case 'o':
                    case 'O':
                        charCountA[14]++;
                        break;

                    case 'p':
                    case 'P':
                        charCountA[15]++;
                        break;

                    case 'q':
                    case 'Q':
                        charCountA[16]++;
                        break;

                    case 'r':
                    case 'R':
                        charCountA[17]++;
                        break;

                    case 's':
                    case 'S':
                        charCountA[18]++;
                        break;

                    case 't':
                    case 'T':
                        charCountA[19]++;
                        break;

                    case 'u':
                    case 'U':
                        charCountA[20]++;
                        break;

                    case 'v':
                    case 'V':
                        charCountA[21]++;
                        break;

                    case 'w':
                    case 'W':
                        charCountA[22]++;
                        break;

                    case 'x':
                    case 'X':
                        charCountA[23]++;
                        break;

                    case 'y':
                    case 'Y':
                        charCountA[24]++;
                        break;

                    case 'z':
                    case 'Z':
                        charCountA[25]++;
                        break;
                }               
            }

            for (int i = 0; i < charB.Length; i++)
            {
                switch (charB[i])
                {
                    case 'a':
                    case 'A':
                        charCountB[0]++;
                        break;

                    case 'b':
                    case 'B':
                        charCountB[1]++;
                        break;

                    case 'c':
                    case 'C':
                        charCountB[2]++;
                        break;

                    case 'd':
                    case 'D':
                        charCountB[3]++;
                        break;

                    case 'e':
                    case 'E':
                        charCountB[4]++;
                        break;

                    case 'f':
                    case 'F':
                        charCountB[5]++;
                        break;

                    case 'g':
                    case 'G':
                        charCountB[6]++;
                        break;

                    case 'h':
                    case 'H':
                        charCountB[7]++;
                        break;

                    case 'i':
                    case 'I':
                        charCountB[8]++;
                        break;

                    case 'j':
                    case 'J':
                        charCountB[9]++;
                        break;

                    case 'k':
                    case 'K':
                        charCountB[10]++;
                        break;

                    case 'l':
                    case 'L':
                        charCountB[11]++;
                        break;

                    case 'm':
                    case 'M':
                        charCountB[12]++;
                        break;

                    case 'n':
                    case 'N':
                        charCountB[13]++;
                        break;

                    case 'o':
                    case 'O':
                        charCountB[14]++;
                        break;

                    case 'p':
                    case 'P':
                        charCountB[15]++;
                        break;

                    case 'q':
                    case 'Q':
                        charCountB[16]++;
                        break;

                    case 'r':
                    case 'R':
                        charCountB[17]++;
                        break;

                    case 's':
                    case 'S':
                        charCountB[18]++;
                        break;

                    case 't':
                    case 'T':
                        charCountB[19]++;
                        break;

                    case 'u':
                    case 'U':
                        charCountB[20]++;
                        break;

                    case 'v':
                    case 'V':
                        charCountB[21]++;
                        break;

                    case 'w':
                    case 'W':
                        charCountB[22]++;
                        break;

                    case 'x':
                    case 'X':
                        charCountB[23]++;
                        break;

                    case 'y':
                    case 'Y':
                        charCountB[24]++;
                        break;

                    case 'z':
                    case 'Z':
                        charCountB[25]++;
                        break;
                }
            }

                for (int i = 0; i < charCountA.Length; i++)
                {
                    if (charCountA[i] != charCountB[i])
                        return false;
                }

            return true;
        }
    }
}
