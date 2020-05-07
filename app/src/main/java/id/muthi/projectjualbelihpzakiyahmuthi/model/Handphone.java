package id.muthi.projectjualbelihpzakiyahmuthi.model;

public class Handphone {
    private Integer id;
    private String nama;
    private String harga;

    public Handphone() {
        super();
    }

    public Handphone(Integer id, String nama, String harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
