import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercitoVisitorTest {

    @Test
    void deveIrMorroDoAlemao() {
        MorroDoAlemao morroDoAlemao = new MorroDoAlemao("15/09/2009", 500, 4, 30, "Artilharia e Infantaria");
        ExercitoVisitor visitor = new ExercitoVisitor();
        assertEquals("OcupacaoMorroDoAlemao{dataOcupacao=15/09/2009, totalSoldados=500, totalUnidadesAereas=4, totalCarrosChoque==30, tipoArmamento=Artilharia e Infantaria}", visitor.ir(morroDoAlemao));
    }

    @Test
    void deveIrRocinha() {
        Rocinha rocinha = new Rocinha("30/12/2009", 400, 6, 45, "Artilharia e Engenharia militar");

        ExercitoVisitor visitor = new ExercitoVisitor();
        assertEquals("OcupacaoRocinha{dataOcupacao=30/12/2009, totalSoldados=400, totalUnidadesAereas=6, totalCarrosChoque==45, tipoArmamento=Artilharia e Engenharia militar}", visitor.ir(rocinha));
    }

    @Test
    void deveIrComplexoDaPenha() {
        ComplexoDaPenha complexoDaPenha = new ComplexoDaPenha("25/07/2013", 800, 13, 74, "Artilharia");
        ExercitoVisitor visitor = new ExercitoVisitor();
        assertEquals("OcupacaoComplexoDaPenha{dataOcupacao=25/07/2013, totalSoldados=800, totalUnidadesAereas=13, totalCarrosChoque==74, tipoArmamento=Artilharia}", visitor.ir(complexoDaPenha));
    }
}
