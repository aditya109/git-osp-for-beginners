using System;

namespace Maximum_Gap
{
    class MaximumGap
    {
        static void Main(string[] args)
        {
            int arraySize = 0;

            Console.Write("Number of elements in the array: ");
            arraySize = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine();

            int[] array = new int[arraySize];

            for(int i = 0; i < arraySize; i++)
            {
                Console.Write("Element #{0}: ", i+1);
                array[i] = Convert.ToInt32(Console.ReadLine());
            }

            for(int i = 0; i < arraySize; i++)
                for (int j = 1; j < arraySize; j++)
                    if(array[i] > array[j])
                    {
                        int aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }

            int maxGap = 0;

            if(arraySize >= 2) {
            for (int i = 0; i < arraySize - 1; i++)
                if (array[i] - array[i + 1] > maxGap)
                    maxGap = array[i] - array[i + 1];
            }

            Console.WriteLine();
            Console.WriteLine("Max gap: {0}", maxGap);

            Console.WriteLine();
            Console.WriteLine("Press enter to close...");
            Console.ReadLine();
        }
    }
}
