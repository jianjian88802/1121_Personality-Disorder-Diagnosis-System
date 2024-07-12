const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot212h6/",
            name: "springboot212h6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot212h6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "人格障碍诊断系统"
        } 
    }
}
export default base
