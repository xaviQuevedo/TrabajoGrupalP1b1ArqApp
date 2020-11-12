package ec.edu.utpl.arqapl.o20f21.semana5.primerparcial.core;

import java.io.File;
//Se cambia a clase, por la razon que va contener todos los metodos
//de expotacion de documentos
public  class  Exportable implements OdtFile,MdFile,PDFFile,DocxFile, HtmlFile{



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


/*
public interface Exportable {

    File toPdf(String texto);
    File toMd(String texto);
    File toHtml(String texto);
    File toDocx(String texto);
    File toOdt(String texto);
}
*/