package vn.insurance.core.config;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import vn.insurance.core.constants.ConfigConstants;
import vn.insurance.core.service.IUserRepository;

/**
 * Created by thangnguyen-imac on 4/24/16.
 */
@Configuration
@EnableMongoRepositories(basePackages = "vn.insurance.core")
public class MongoConfig extends AbstractMongoConfiguration {

    @Autowired
    IUserRepository userRepository;

    protected String getDatabaseName() {
        return ConfigConstants.DATA_NAME;
    }

    @Bean
    public Mongo mongo() throws Exception {
        /*ServerAddress serverAddress = new ServerAddress("localhost", 27017);
        MongoCredential credential = MongoCredential.createMongoCRCredential("vivek","sample","vivek".toCharArray());
        MongoClientOptions options = MongoClientOptions.builder().connectionsPerHost(4).socketKeepAlive(true).build();
        Mongo mongo = new MongoClient(serverAddress, Arrays.asList(credential),options);

        return mongo;*/
        return new MongoClient(ConfigConstants.HOST, ConfigConstants.PORT);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception{
        return new MongoTemplate(mongo(), ConfigConstants.DATA_NAME);
    }
}
