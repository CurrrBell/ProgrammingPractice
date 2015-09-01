using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgrammingProjectCSharp
{
    class Palindrome
    {
        static void Main(string[] args)
        {
            String test1 = "racecar";
            String test2 = "not a palindrome";

            Console.WriteLine(isPalindrome(test1));
            Console.WriteLine(isPalindrome(test2));

        }

        static bool isPalindrome(string s)
        {
            char[] chars = s.ToCharArray();
            int end = chars.Length-1;

            for (int i = 0; i < chars.Length / 2; i++)
            {
                if (chars[i] != chars[end - i])
                    return false;
            }

                return true;
        }
    }
}
