package es.valhalla.web.fermi.engine.component.style

import es.valhalla.web.fermi.engine.component.style.Style.Companion.BASE_STYLE
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StyleTest {
	@Test
	fun `basic style properties`() {
		val style = BASE_STYLE
		assertThat(style.styleId).isEqualTo("BASE_STYLE")
		assertThat(style.parentStyleId).isNull()
		assertThat(style.backgroundColor).isEqualTo(Colors.TRANSPARENT)
		assertThat(style.foregroundColor).isEqualTo(Colors.BLACK)
	}

	@Test
	fun `copy style like if was a data class but creating a new styleId`() {
		val style = BASE_STYLE.copy(styleId = "MODIFIED_STYLE_ID")

		assertThat(style.styleId)
			.isNotNull()
			.isEqualTo("MODIFIED_STYLE_ID")
		assertThat(style.backgroundColor).isEqualTo(Colors.TRANSPARENT)
		assertThat(style.foregroundColor).isEqualTo(Colors.BLACK)
	}
}
