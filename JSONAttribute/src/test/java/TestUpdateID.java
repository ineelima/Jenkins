public class TestUpdateID {

    public static void main(String[] args) {

       // public void updateId(){
            JsonAdded jsonAdd= new JsonAdded();
            Newmen newmen=new Newmen();
            IDNew idnew=new IDNew();
            newmen.setIdnew(idnew);
            Clasadd1 add1=new Clasadd1();
            add1.setMew(newmen);
            jsonAdd.setAdded(add1);
            jsonAdd.Added.getMew().idnew.setId("123456");
            System.out.println(jsonAdd.Added.getMew().idnew.getId());
        }
    }

