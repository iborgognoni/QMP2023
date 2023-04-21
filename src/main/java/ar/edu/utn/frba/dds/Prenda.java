enum Categoria {
    CALZADO, PARTE_SUPERIOR, PARTE_INFERIOR, ACCESORIO
}

enum Tipo {
    ZAPATO, CAMISA, PANTALON
}

enum Material {
    TELA, LANA, JEAN
}


class Prenda {
    Categoria categoria;
    Tipo tipo;
    Material material;
    String colorPrincipal;
    String colorSecundario;

    Prenda(Categoria categoria, Tipo tipo, Material material, String colorPrincipal, String colorSecundario) {

        if(categoria == null || tipo == null || material == null || colorPrincipal == null) {
            throw new ErrorPrendaNoValida(
                "Faltan atributos de la prenda"
            );
        }

        this.categoria = categoria;
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }
}

class PrendaBuilder {
    Prenda crearZapato(Material material, String colorPrincipal, String colorSecundario) {
        return new Prenda(Categoria.CALZADO, Tipo.ZAPATO, material, colorPrincipal, colorSecundario);
    }
}

