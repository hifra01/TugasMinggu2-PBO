package pbo.b.nim202410101119;

public class PersegiPanjang {
    double Length, Width, Height;

    public PersegiPanjang(double Length, double Width, double Height) {
            this.Length = Length; this.Width = Width; this.Height = Height;
    }

    double YukHitungLuasPermukaan() {
        return (2 * ((Length*Width) + (Width*Height) + (Length*Height)));
    }

    double YukHitungVolume() {
        return (Length*Width*Height);
    }
} 
