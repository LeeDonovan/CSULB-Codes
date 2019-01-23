public class PetTester{
    public static void main(String[] args)
   {
       Pets pet1 = new Pets("Wolfe",9,"Husky");
       Pets pet2 = new Pets("Meowth",2,"Cat");
       Pets pet3 = new Pets("PokaDot",4,"Dog");
       Pets pet4 = new Pets("Striker",3,"Fish");
       BinarySearchTree tree = new BinarySearchTree();
       tree.add(pet1);
       tree.add(pet2);
       tree.add(pet3);
       tree.add(pet4);

        tree.print();
   }


}