package nfl.playdb.dao;

import org.jooq.DSLContext;
import org.jooq.impl.TableImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class PlayDBDAO<T extends TableImpl<?>> {

	@Autowired
	protected DSLContext dslCtx;

	private final T tab;

	protected PlayDBDAO(final T tab) {
		this.tab = tab;
	}

	protected T table() {
		return tab;
	}
}
