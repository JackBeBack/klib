package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.DotsHorizontal: ImageVector
    get() {
        if (_DotsHorizontal != null) {
            return _DotsHorizontal!!
        }
        _DotsHorizontal = ImageVector.Builder(
            name = "DotsHorizontal",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 12f)
                curveTo(7f, 13.657f, 5.657f, 15f, 4f, 15f)
                curveTo(2.343f, 15f, 1f, 13.657f, 1f, 12f)
                curveTo(1f, 10.343f, 2.343f, 9f, 4f, 9f)
                curveTo(5.657f, 9f, 7f, 10.343f, 7f, 12f)
                close()
                moveTo(2.972f, 12f)
                curveTo(2.972f, 12.568f, 3.432f, 13.028f, 4f, 13.028f)
                curveTo(4.568f, 13.028f, 5.028f, 12.568f, 5.028f, 12f)
                curveTo(5.028f, 11.432f, 4.568f, 10.972f, 4f, 10.972f)
                curveTo(3.432f, 10.972f, 2.972f, 11.432f, 2.972f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15f, 12f)
                curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
                curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
                curveTo(9f, 10.343f, 10.343f, 9f, 12f, 9f)
                curveTo(13.657f, 9f, 15f, 10.343f, 15f, 12f)
                close()
                moveTo(10.972f, 12f)
                curveTo(10.972f, 12.568f, 11.432f, 13.028f, 12f, 13.028f)
                curveTo(12.568f, 13.028f, 13.028f, 12.568f, 13.028f, 12f)
                curveTo(13.028f, 11.432f, 12.568f, 10.972f, 12f, 10.972f)
                curveTo(11.432f, 10.972f, 10.972f, 11.432f, 10.972f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 12f)
                curveTo(23f, 13.657f, 21.657f, 15f, 20f, 15f)
                curveTo(18.343f, 15f, 17f, 13.657f, 17f, 12f)
                curveTo(17f, 10.343f, 18.343f, 9f, 20f, 9f)
                curveTo(21.657f, 9f, 23f, 10.343f, 23f, 12f)
                close()
                moveTo(18.972f, 12f)
                curveTo(18.972f, 12.568f, 19.432f, 13.028f, 20f, 13.028f)
                curveTo(20.568f, 13.028f, 21.028f, 12.568f, 21.028f, 12f)
                curveTo(21.028f, 11.432f, 20.568f, 10.972f, 20f, 10.972f)
                curveTo(19.432f, 10.972f, 18.972f, 11.432f, 18.972f, 12f)
                close()
            }
        }.build()

        return _DotsHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _DotsHorizontal: ImageVector? = null
