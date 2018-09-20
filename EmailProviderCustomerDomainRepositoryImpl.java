@Repository
public class EmailProviderCustomerDomainRepositoryImpl implements EmailProviderCustomerDomainRepositoryExt {

final static Logger logger = (Logger) LoggerFactory.getLogger(EmailProviderCustomerDomainRepositoryImpl.class);


@Autowired
	@Qualifier("mongoTemplate")
	private MongoTemplate mongoTemplate;

}