package Core4;
    public interface Eatable {

        public static class User {
            private static int counter = 0;
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
                counter ++;
            }

            public static int getCounter() {
                return counter;
            }

            public static void setCounter(int counter) {
                User.counter = counter;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }


    }

