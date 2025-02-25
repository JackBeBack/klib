package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserPenAlt1: ImageVector
    get() {
        if (_UserPenAlt1 != null) {
            return _UserPenAlt1!!
        }
        _UserPenAlt1 = ImageVector.Builder(
            name = "UserPenAlt1",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 21f)
                curveTo(4f, 17.134f, 7.134f, 14f, 11f, 14f)
                curveTo(11.34f, 14f, 11.673f, 14.024f, 12f, 14.071f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
                moveTo(12.59f, 21f)
                lineTo(14.615f, 20.595f)
                curveTo(14.791f, 20.56f, 14.88f, 20.542f, 14.962f, 20.51f)
                curveTo(15.035f, 20.481f, 15.104f, 20.444f, 15.169f, 20.399f)
                curveTo(15.241f, 20.348f, 15.305f, 20.285f, 15.432f, 20.157f)
                lineTo(19.59f, 16f)
                curveTo(20.142f, 15.448f, 20.142f, 14.552f, 19.59f, 14f)
                curveTo(19.038f, 13.448f, 18.142f, 13.448f, 17.59f, 14f)
                lineTo(13.432f, 18.157f)
                curveTo(13.305f, 18.285f, 13.241f, 18.348f, 13.191f, 18.421f)
                curveTo(13.146f, 18.485f, 13.109f, 18.555f, 13.08f, 18.628f)
                curveTo(13.048f, 18.71f, 13.03f, 18.799f, 12.995f, 18.975f)
                lineTo(12.59f, 21f)
                close()
            }
        }.build()

        return _UserPenAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _UserPenAlt1: ImageVector? = null
