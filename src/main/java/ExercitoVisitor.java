public class ExercitoVisitor implements Visitor{
    public String ir(Exercito exercito) {
        return exercito.ir(this);
    }

    @Override
    public String irMorroDoAlemao(MorroDoAlemao morroDoAlemao) {
        return "OcupacaoMorroDoAlemao{" +
                "dataOcupacao=" + morroDoAlemao.getDataOcup() +
                ", totalSoldados=" + morroDoAlemao.getTotalSoldados()  +
                ", totalUnidadesAereas=" + morroDoAlemao.getUnidAerea() +
                ", totalCarrosChoque==" + morroDoAlemao.getCarrosChoque() +
                ", tipoArmamento=" + morroDoAlemao.getTipoArmamento() +
                '}';
    }

    @Override
    public String irRocinha(Rocinha rocinha) {
        return "OcupacaoRocinha{" +
                "dataOcupacao=" + rocinha.getDataOcup() +
                ", totalSoldados=" + rocinha.getTotalSoldados()  +
                ", totalUnidadesAereas=" + rocinha.getUnidAerea() +
                ", totalCarrosChoque==" + rocinha.getCarrosChoque() +
                ", tipoArmamento=" + rocinha.getTipoArmamento() +
                '}';
    }

    @Override
    public String irComplexoDaPenha(ComplexoDaPenha complexoDaPenha) {
        return "OcupacaoComplexoDaPenha{" +
                "dataOcupacao=" + complexoDaPenha.getDataOcup() +
                ", totalSoldados=" + complexoDaPenha.getTotalSoldados()  +
                ", totalUnidadesAereas=" + complexoDaPenha.getUnidAerea() +
                ", totalCarrosChoque==" + complexoDaPenha.getCarrosChoque() +
                ", tipoArmamento=" + complexoDaPenha.getTipoArmamento() +
                '}';
    }
}
