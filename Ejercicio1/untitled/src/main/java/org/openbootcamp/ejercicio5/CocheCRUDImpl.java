package org.openbootcamp.ejercicio5;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {

    }
    @Override
    public void findAll() {
    }
    @Override
    public void delete() {
    }
    String save = "Guardar";
    String findAll = "Buscar";
    String delete = "Borrar";
    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        System.out.println(cocheCRUD);

    }


}


