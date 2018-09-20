	@Override
	public CustomerDomain getDomain(String username, String password, int id) {
		getMapper();
		String authHeader = getAuth(username, password);
		String payload = null;
		JsonNode response1;
		CustomerDomain customerdomain = null;
		List<CustomerDomain> customerdomains = null;
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", "application/json");
			headers.add("Authorization", authHeader);

			HttpEntity<String> entity = new HttpEntity<String>(headers);
			Map<String, Object> map1 = new HashMap<>();
			map1.put("id", id);
			map1.put("username", username);

			try {
				payload = mapper.writeValueAsString(map1);
			} catch (Exception e) {
				return null;
			}
			try {
				/*
				 * NEWDOMAIN = NEWDOMAIN + "/" + id; JsonNode response =
				 * restTemplate.exchange(NEWDOMAIN, HttpMethod.GET, entity,
				 * JsonNode.class).getBody();
				 */

				response1 = restTemplate.exchange(NEWDOMAIN + "/" + id, HttpMethod.GET, entity, JsonNode.class)
						.getBody();

				//customerdomains = deserializeList(response1, CustomerDomain.class, new ObjectMapper());
				System.out.println(response1);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerdomain;
	}
