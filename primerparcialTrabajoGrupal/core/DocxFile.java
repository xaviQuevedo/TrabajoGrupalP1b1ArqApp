package ec.edu.utpl.arqapl.o20f21.semana5.primerparcial.core;



import java.io.File;

public interface DocxFile {
    File toDocx (String texto);
}


/*
import java.io.File;

public class DocxFile implements Exportable {
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
        System.out.println("Exportando a Docx");
        return new File(System.getProperty("user.home"));
    }

    @Override
    public File toOdt(String texto) {
        return null;
    }
}
*/