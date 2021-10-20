package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        if (a || b){
            System.out.println("a or b is true");
        }
        if(b ^ true){
            System.out.println("either a or b is true, but both can't be true");//used to toggle values
        }
        if(a & b){
            System.out.println("a and b is true");
        }
        if(a && b){
            System.out.println("evaluates left side first, if true then right side is evaluated");
        }
        if(a & !b){
            System.out.println("this is printed if both a & b are true");
        }

        // write your code below

    }

}

