package com.lang;

public class CFG {
		static boolean isPangram(String S)
		{
			if (S.length() < 26)
				return false;

			
			boolean[] visited = new boolean[26];

			for (int i = 0; i < S.length(); i++) {
				visited[S.charAt(i) - 'a'] = true;
			}

			int count = 0;

			for (int i = 0; i < 26; i++) {
				if (!visited[i])
					count++;
			}
			return true;
			
			
		}
		
		// Driver code
		public static void main(String[] args)
		{
			String S = "thequickquickfoxmumpsoverthelazydog";
			
			
			
			System.out.print(isPangram(S));
		}
	}



