package com.deno4ka.LeetCode.algorithms.easy;

/*
Every valid email consists of a local name and a domain name, separated by the '@' sign.
Besides lowercase letters, the email may contain one or more '.' or '+'.
For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
If you add periods '.' between some characters in the local name part of an email address,
mail sent there will be forwarded to the same address without dots in the local name.
Note that this rule does not apply to domain names.
For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
This allows certain emails to be filtered. Note that this rule does not apply to domain names.
For example, "m.y+name@email.com" will be forwarded to "my@email.com".
It is possible to use both of these rules at the same time.
Given an array of strings emails where we send one email to each email[i],
return the number of different addresses that actually receive mails.

Example 1:
Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.

Example 2:
Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3

Constraints:
1 <= emails.length <= 100
1 <= emails[i].length <= 100
email[i] consist of lowercase English letters, '+', '.' and '@'.
Each emails[i] contains exactly one '@' character.
All local and domain names are non-empty.
Local names do not start with a '+' character.
*/

import java.util.HashSet;
import java.util.Set;

public class _929_UniqueEmailAddresses {

    //	Runtime: 20 ms, faster than 36.18% & Memory Usage: 39.7 MB, less than 36.55%
    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length == 0) return 0;
        if (emails.length == 1) return 1;
        Set<String> uniqueEmailAddresses = new HashSet<>();
        for (String email : emails) {
            String[] emailParts = email.split("@");
            StringBuilder localName = new StringBuilder();
            for (int i = 0; i < emailParts[0].length(); i++) {
                if (email.charAt(i) == '+') {
                    break;
                } else if (email.charAt(i) != '.') {
                    localName.append(email.charAt(i));
                }
            }
            uniqueEmailAddresses.add(localName + "@" + emailParts[1]);
        }
        return uniqueEmailAddresses.size();
    }

}
