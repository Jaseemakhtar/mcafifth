package triangleProblem;

public class TriangleProblem {
    int side1, side2, side3;


    public String getTriangle(int a, int b, int c){
        side1 = a;
        side2 = b;
        side3 = c;

        String triangle;

        if(side1 < 10 || side2 < 10 || side3 < 10){
            triangle = "sides must be greater than 10";
        }else{
            if((side1 > side2 + side3) || (side2 > side1 + side3) || (side3 > side1 + side2)){
                triangle = "not a triangle";
            }else{
                if(side1 == side2 && side2 == side3)
                    triangle = "equilateral";
                else if(side1 == side2 || side2 == side3 || side3 == side1)
                    triangle = "isosceles";
                else
                    triangle = "scalene";
            }
        }

        System.out.println(triangle);

        return triangle;
    }
}
