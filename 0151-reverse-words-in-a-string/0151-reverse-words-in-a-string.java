class Solution {
    public String reverseWords(String s) {
	int left = 0;
	int right = s.length() - 1;

	String temp = "";
	String ans = "";

	//Iterate the string and keep on adding to form a word
	//If empty space is encountered then add the current word to the result
	while (left <= right)
	{
		char ch = s.charAt(left);
		if (ch != ' ')
		{
			temp += ch;
		}
		else if (ch == ' ')
		{
			if (temp.length() > 0)
			{
				ans = temp + " " + ans;
			}
			temp = "";
		}
		left++;
	}

	//If not empty string then add to the result(Last word is added)
	if (temp.length() > 0)
	{
		ans = temp + " " + ans;
	}

    if (ans.charAt(ans.length() - 1) == ' ')
    {
        ans = ans.substring(0, ans.length() - 1);
    }

	return ans;
    }
}