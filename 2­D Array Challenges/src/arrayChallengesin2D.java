
public class arrayChallengesin2D
	{

		public static void main(String[] args)
			{
				challenge1();
				System.out.println();
				challenge2();
				System.out.println();
				challenge3();
				System.out.println();
				extraChallenge();

			}
		public static void challenge1()
		{
			int [] [] myMatrix = { {10, 20}, {30, 40}, {50, 60} };
			System.out.println(myMatrix[2][1]);
		}
		public static void challenge2()
		{
			String [] [] mullenMatrix = new String[4] [3];
			for(int row = 0; row < mullenMatrix.length; row++)
				{
					System.out.println();
					for(int col = 0; col < mullenMatrix[0].length; col++)
						{
							mullenMatrix[row][col] = " MHS ";
							System.out.print(mullenMatrix[row][col]);
						}
				}
		}
		public static void challenge3()
		{
			int [] [] myMatrix = new int [3] [3];
			int counter = 1;
			for (int row = 0; row < myMatrix.length; row++)
				{
					System.out.println();
					for(int col = 0; col < myMatrix.length; col++)
						{
							myMatrix[row][col] = counter;
							System.out.print(myMatrix [row][col] + " ");
							counter++;
						}
				}
			System.out.println();
			System.out.println(myMatrix[0][0] + myMatrix[0][2] + myMatrix[2][0] + myMatrix[2][2]);
		}
		public static void extraChallenge()
		{
			int [] [] [] megaMatrix = new int [3] [3] [3];
			int counter = 1;
			int sum = 0;
			for(int row = 0; row < megaMatrix.length; row++)
				{
					System.out.println();
					for(int col = 0; col < megaMatrix.length; col++)
						{
							System.out.println();
							for(int depth = 0; depth < megaMatrix.length; depth++)
								{
									
									megaMatrix[row][col][depth] = counter;
									counter++;
									System.out.print(megaMatrix[row][col][depth] + " ");
									sum += megaMatrix[row][col][depth];
								}
							
						}
				}
			System.out.println();
			System.out.println("The sum is " + sum + ".");
		}

	}
