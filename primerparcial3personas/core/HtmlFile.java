package ec.edu.utpl.arqapl.o20f21.semana5.primerparcial.core;

import java.io.File;
public interface HtmlFile {
    File toHtml(String texto);
}


/* Codigo del Docente
public class HtmlFile implements Exportable {
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
        System.out.println("Exportando a HTML");
        return new File(System.getProperty("user.home"));
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