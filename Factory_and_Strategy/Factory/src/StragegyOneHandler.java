public class StragegyOneHandler extends DataHandler {

    @Override
    public Object handle(DataBean dataBean) {
        if (dataBean == null) {
            return super.handle(null);
        }
        // do something to handle
        return new Object();
    }

}
