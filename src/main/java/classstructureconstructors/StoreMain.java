package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store cpuStore = new Store("CPU");
        cpuStore.store(128);
        System.out.println(cpuStore.getProduct()+cpuStore.getStock()+"db");
        cpuStore.dispatch(22);
        System.out.println(cpuStore.getProduct()+cpuStore.getStock()+"db");

        Store hddStore = new Store("HDD");
        hddStore.store(256);
        System.out.println(hddStore.getProduct()+hddStore.getStock()+"db");
        hddStore.dispatch(55);
        System.out.println(hddStore.getProduct()+hddStore.getStock()+"db");

    }

}
