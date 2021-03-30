package MoreOnClasses;
//anonymous classes
public class Machine {
        public void Start() {

            System.out.println("Starting..");
        }

    public static void main(String[] args) {
        Machine m = new Machine(){
            @Override
            public void Start() {
                System.out.println(" wooo");
            }
        };
        m.Start();
    }
    }
