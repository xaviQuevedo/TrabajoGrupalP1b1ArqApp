package ec.edu.utpl.arqapl.o20f21.semana5.primerparcial.core;

import java.io.File;

public interface OdtFile {
    File toOdt(String texto);
}

/*
public class OdtFile implements Exportable {
    @Override
    public File toPdf(String texto) {
        return null;
    }

    @Override
    public File toMd(String texto) {
        return null;
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
        System.out.println("Exportando a Odt");
        return new File(System.getProperty("user.home"));
    }
}
 */


