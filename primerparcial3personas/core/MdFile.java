package ec.edu.utpl.arqapl.o20f21.semana5.primerparcial.core;

import java.io.File;

public interface MdFile {
    File toPdf(String texto);
}


/*
public class MdFile implements Exportable {
    @Override
    public File toPdf(String texto) {
        return null;

    }

    @Override
    public File toMd(String texto) {
        System.out.println("Exportando a MarkDown");
        return new File(System.getProperty("user.home"));
    }

    @Override
    public File toHtml(String texto) {
        return null;
    }

    @Override
    public File toDocx(String texto) {
        return null;
    }

    @Override
    public File toOdt(String texto) {
        return null;

    }
}


 */
