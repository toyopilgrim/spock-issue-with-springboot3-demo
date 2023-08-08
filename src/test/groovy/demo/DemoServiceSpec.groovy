package demo

import com.example.demo.DemoService
import com.example.demo.DemoPostConstruct
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = [DemoPostConstruct])
class DemoServiceSpec extends Specification {

  def "demo"() {
    when:
    def res = new DemoService().demo()

    then:
    res == "OK"
  }
}
