package com.hua.command;

/**
 * Created by lerry on 2017/7/18.<br/>
 * 命令模式<br/>
 * 我们首先创建作为命令的接口 Order，然后创建作为请求的 Stock 类。实体命令类 BuyStock 和 SellStock，实现了 Order 接口，将执行实际的命令处理。创建作为调用对象的类 Broker，它接受订单并能下订单。
 * Broker 对象使用命令模式，基于命令的类型确定哪个对象执行哪个命令。<br/>
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。<br/>
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，<br/>
 * 该对象执行命令。<br/>
 *
 * @author lerry
 */
public class CommandApplication {

    /**
     * 在软件设计中，我们经常需要向某些对象发送请求，但是并不知道请求的接收者是谁，也不知道被请求的操作是哪个，
     * 我们只需在程序运行时指定具体的请求接收者即可，此时，可以使用命令模式来进行设计，
     * 使得请求发送者与请求接收者消除彼此之间的耦合，让对象之间的调用关系更加灵活。
     * <p>
     * 命令模式可以对发送者和接收者完全解耦，发送者与接收者之间没有直接引用关系，
     * 发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求。这就是命令模式的模式动机。
     * <p/>
     * <p/>
     * <p/>
     * Spring JdbcTemplate中的命令模式
     * 尽管Spring JdbcTemplate被人们认为是模板方法模式应用的典范，但是从另一个角度理解，其实它也是命令模式应用的最佳实践。
     * 以 JdbcTemplate#query(String sql,RowMapper mapper)这个方法为例，
     * 我们可以把JdbcTemplate对象看做是命令模式类图中的Invoker(请求者)，
     * 而把RowMapper看做是 Command(命令)，
     * 在query的过程中JdbcTemplate为RowMapper的执行准备了所有必要的上下文（即ResultSet），
     * 客户端（这 里是应用程序中的DAO层）的调用模式也基本符合invoker.execute(Command cmd)。
     * 如果说上面我的结论尚显得牵强，不妨看看
     * JdbcTemplate#query(String sql,RowMapper mapper)这个方法的内部实现：
     * public <T> List<T> query(String sql, RowMapper<T> rowMapper) throws DataAccessException {
     * return query(sql, new RowMapperResultSetExtractor<T>(rowMapper));
     * }
     * 很显然，内部实现调用了JdbcTemplate#query(final String sql, final ResultSetExtractor<T> rse)方法，
     * 而这个方法内部又调用了JdbcTemplate#execute(StatementCallback<T> action)方法，
     * 这个方法显然更符合命令模式了，StatementCallback是命令接口，JdbcTemplate负责为命令的执行创建必要 的上下文（即java.sql.Statement）
     * 自己备注: QueryStatementCallback 是一个匿名内部类,实现了StatementCallback接口
     *
     * @param args
     */
    public static void main(String[] args) {
        // 请求类
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        // 调用类
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        // 调用方法/发号施令
        broker.placeOrders();
    }
}
