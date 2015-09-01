using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgrammingProjectCSharp
{
    class StringReverse
    {
        /*
         * Starting September 1, these exercises will be done in C# for more practice
         */

        static void Main(string[] args)
        {
            string test = "Test string";
            Console.WriteLine(iterativeReverseString(test));
            Console.WriteLine(recursiveReverseString(test));
        }

        static string iterativeReverseString(String s)
        {
            string rev = "";
            char[] chars = s.ToCharArray();

            for (int i = s.Length - 1; i >= 0; i--)
            {
                rev += chars[i];
            }

            return rev;
        }

        static string recursiveReverseString(String s)
        {
            if (s.Length == 0)
            {
                return "";
            }

            else
            {
                char[] chars = s.ToCharArray();
                string rev = "";

                rev = recursiveReverseString(s.Substring(1, s.Length - 1)) + chars[0];

                return rev;
            }

        }
    }
}
