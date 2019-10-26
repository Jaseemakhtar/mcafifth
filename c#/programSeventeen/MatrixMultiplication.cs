using System;

namespace MatrixMultiplication
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1, n2, m1, m2;
            int[,] matrixA, matrixB;
            
            
            m1 = readInt("Enter the value of m, for first M x N matrix\n");
            n1 = readInt("Enter the value of n, for first M x N matrix\n");

            
            m2 = readInt("Enter the value of m, for second M x N matrix\n");
            n2 = readInt("Enter the value of n, for second M x N matrix\n");

            if (n1 != m2)
            {
                Console.WriteLine("Sorry! Matrices cannot be multiplied\n");
            }
            else
            {
                matrixA = new int[m1, n1];
                matrixB = new int[m2, n2];

                matrixA = readMatrix(m1, n1);
                matrixB = readMatrix(m2, n2);

                displayMatrix(matrixA, m1, n1);
                displayMatrix(matrixB, m2, n2);

                int[,] matrixC = new int[m1, n2];

                for (int m = 0; m < m1; m++)
                {
                    for (int n = 0; n < n2; n++)
                    {
                        int sum = 0;
                        for (int k = 0; k < m2; k++)
                            sum += matrixA[m, k] * matrixB[k, n];
                        matrixC[m, n] = sum;
                    }
                }


                Console.WriteLine("Resultant Matrix: ");
                displayMatrix(matrixC, m1, n2);
            }
            Console.ReadLine();
            
        }

        static int readInt(String message)
        {
            Console.Write(message);
            return Convert.ToInt16(Console.ReadLine());
        }

        static int[,] readMatrix(int m, int n)
        {
            int[,] mat = new int[m, n];

            Console.WriteLine("Enter the elements of Matrix {0} x {1}", m, n);
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    mat[i, j] = readInt("");

            return mat;
        }

        static void displayMatrix(int[,] mat, int m, int n)
        {
            Console.WriteLine("Matrix {0} x {1}", m, m);
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                    Console.Write("{0} ", mat[i, j]);
                Console.WriteLine("");
            }
        }
    }
}
