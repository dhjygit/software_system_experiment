public class mybatistest {
//    @Test
//    public void test1() throws IOException {
//        //获得核心配置文件
//        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        //获得session工厂对象
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        //获得session会话对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        ViewMapper mapper = sqlSession.getMapper(ViewMapper.class);
//        //执行操作 参数：namespace+id
//        List<View> viewList = mapper.findAllView();
//        for (View view : viewList){
//            System.out.println(view);
//        }
//        //释放资源
//        sqlSession.close();
//    }
}
