public class Main {
    public static void main(String[] args) {
        Cyclist cyclist1 = new Cyclist("Tadej", "Pogacar");
        cyclist1.setTeam("UAE");
        cyclist1.setJerseyNumber(1);
        System.out.println("Cyclist:"+ cyclist1.getName()+","+ cyclist1.getSurname()+","+ cyclist1.getTeam()+","+ cyclist1.getJerseyNumber());

        Cyclist cyclist2 = new Cyclist();
        cyclist2.setName("Primoz");
        cyclist2.setSurname("Roglic");
        System.out.println("Cyclist:"+ cyclist2.getName()+","+ cyclist2.getSurname()+","+ cyclist2.getTeam()+","+ cyclist2.getJerseyNumber());
    }
}
