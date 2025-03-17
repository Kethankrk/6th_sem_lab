

class CountObject {
    static int count = 0;

    public CountObject() {
        CountObject.count += 1;
    }

    
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new CountObject();
        }

        System.out.println("Total instace count: " + CountObject.count);
    }
}