package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.DotsVertical: ImageVector
    get() {
        if (_DotsVertical != null) {
            return _DotsVertical!!
        }
        _DotsVertical = ImageVector.Builder(
            name = "DotsVertical",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15f, 20f)
                curveTo(15f, 21.657f, 13.657f, 23f, 12f, 23f)
                curveTo(10.343f, 23f, 9f, 21.657f, 9f, 20f)
                curveTo(9f, 18.343f, 10.343f, 17f, 12f, 17f)
                curveTo(13.657f, 17f, 15f, 18.343f, 15f, 20f)
                close()
                moveTo(10.972f, 20f)
                curveTo(10.972f, 20.568f, 11.432f, 21.028f, 12f, 21.028f)
                curveTo(12.568f, 21.028f, 13.028f, 20.568f, 13.028f, 20f)
                curveTo(13.028f, 19.432f, 12.568f, 18.972f, 12f, 18.972f)
                curveTo(11.432f, 18.972f, 10.972f, 19.432f, 10.972f, 20f)
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
                moveTo(15f, 4f)
                curveTo(15f, 5.657f, 13.657f, 7f, 12f, 7f)
                curveTo(10.343f, 7f, 9f, 5.657f, 9f, 4f)
                curveTo(9f, 2.343f, 10.343f, 1f, 12f, 1f)
                curveTo(13.657f, 1f, 15f, 2.343f, 15f, 4f)
                close()
                moveTo(10.972f, 4f)
                curveTo(10.972f, 4.568f, 11.432f, 5.028f, 12f, 5.028f)
                curveTo(12.568f, 5.028f, 13.028f, 4.568f, 13.028f, 4f)
                curveTo(13.028f, 3.432f, 12.568f, 2.972f, 12f, 2.972f)
                curveTo(11.432f, 2.972f, 10.972f, 3.432f, 10.972f, 4f)
                close()
            }
        }.build()

        return _DotsVertical!!
    }

@Suppress("ObjectPropertyName")
private var _DotsVertical: ImageVector? = null
