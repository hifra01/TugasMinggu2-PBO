package pbo.b.nim202410101032;

public class BangunRuang {
    int alasSegi3, tinggiSegi3, sisilainSegi3, tinggiPrisma;
    public BangunRuang (int alasSegi3, int tinggiSegi3, int sisilainSegi3, int tinggiPrisma){
        this.alasSegi3 = alasSegi3;
        this.tinggiSegi3 = tinggiSegi3;
        this.sisilainSegi3 = sisilainSegi3;
        this.tinggiPrisma = tinggiPrisma;
    }
    double outVolume(){
        return (alasSegi3 * tinggiSegi3 / 2) * tinggiPrisma;
    }
    double outLuasPermukaan(){
        return ((2 * (1/2 * alasSegi3 * tinggiSegi3)) + ((alasSegi3 + tinggiSegi3 + sisilainSegi3) * tinggiPrisma));
    }
}
class mainBangunRuang{
    public static void main(String[]args){
        BangunRuang prisma = new BangunRuang(3, 4, 5, 8);
        System.out.println("- Menghitung Volume dan Luas Permukaan dari Prisma Segitiga -");
        System.out.println("Volume Prisma Segitiga: "+prisma.outVolume()+" cm3");
        System.out.println("Luas Permukaan Prisma Segitiga: "+prisma.outLuasPermukaan()+" cm2");
    }
}
